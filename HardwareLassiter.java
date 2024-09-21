/**
 * HardwareLassiter
 * This class represents hardware with various specifications and provides methods to set and get these specifications.
 * Author: Heather Lassiter
 */
public class HardwareLassiter {
    // Fields
    private String processor;
    private double gpuClockSpeed;
    private double cpuClockSpeed;
    private int cpuCoreNumber;
    private int monitorResolution;
    private char overclock;

    // Constructors
    public HardwareLassiter() {
        this.processor = "";
        this.gpuClockSpeed = 0.0;
        this.cpuClockSpeed = 0.0;
        this.cpuCoreNumber = 0;
        this.monitorResolution = 0;
        this.overclock = 'N';
    }

    public HardwareLassiter(String pType, double gpu, double cpu, int cores, int resolution, char overC) {
        this.processor = pType;
        this.gpuClockSpeed = gpu;
        this.cpuClockSpeed = cpu;
        this.cpuCoreNumber = cores;
        this.monitorResolution = resolution;
        this.overclock = overC;
    }

    // Setters
    public void setProcessor(String pType) {
        this.processor = pType;
    }

    public void setGpuClockSpeed(double gpu) {
        this.gpuClockSpeed = gpu;
    }

    public void setCpuClockSpeed(double cpu) {
        this.cpuClockSpeed = cpu;
    }

    public void setCpuCoreNumber(int cores) {
        this.cpuCoreNumber = cores;
    }

    public void setMonitorResolution(int resolution) {
        this.monitorResolution = resolution;
    }

    public void setOverClock(char overC) {
        this.overclock = overC;
    }

    // Getters
    public String getProcessor() {
        return this.processor;
    }

    public String getResolutionString() {
        return this.monitorResolution + "p";
    }

    public double getMultiplierValue() {
        return this.cpuClockSpeed * this.cpuCoreNumber;
    }

    public double calculatePerformanceScore() {
        return (this.gpuClockSpeed + this.cpuClockSpeed * this.cpuCoreNumber) / 2;
    }

    public String getRecommendedQuality() {
        if (this.calculatePerformanceScore() > 1000) {
            return "High";
        } else if (this.calculatePerformanceScore() > 500) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    public char getOverclockChoice() {
        return this.overclock;
    }

    public void displayInformation() {
        System.out.println("Processor: " + this.getProcessor());
        System.out.println("GPU Clock Speed: " + this.gpuClockSpeed + " GHz");
        System.out.println("CPU Clock Speed: " + this.cpuClockSpeed + " GHz");
        System.out.println("CPU Core Number: " + this.cpuCoreNumber);
        System.out.println("Monitor Resolution: " + this.getResolutionString());
        System.out.println("Overclocking: " + this.getOverclockChoice());
        System.out.println("Performance Score: " + this.calculatePerformanceScore());
        System.out.println("Recommended Quality: " + this.getRecommendedQuality());
    }
}

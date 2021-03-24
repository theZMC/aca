package com.uofjava;

import java.time.LocalDate;

public class Internet {
    private static String stringFormat = "%-10s %12s %12s %12s %12s";
    private static String speedFormat  = "%4dMb/s";

    private String      productId;
    private int         uploadSpeed;
    private int         downloadSpeed;
    private LocalDate   startDate;
    private LocalDate   endDate;
    

    public Internet(String productId, int uploadSpeed, int downloadSpeed, LocalDate startDate, LocalDate endDate){
        this.productId      = productId;
        this.uploadSpeed    = uploadSpeed;
        this.downloadSpeed  = downloadSpeed;
        this.startDate      = startDate;
        this.endDate        = endDate;
    }

    public String toString() {
        String uploadSpeedString = String.format(speedFormat, uploadSpeed);
        String downloadSpeedString = String.format(speedFormat, downloadSpeed);
        return String.format(stringFormat, productId, uploadSpeedString, downloadSpeedString, startDate, endDate);
    }
    public String toString(String customFormat) {
        String uploadSpeedString = String.format(speedFormat, uploadSpeed);
        String downloadSpeedString = String.format(speedFormat, downloadSpeed);
        return String.format(customFormat, productId, uploadSpeedString, downloadSpeedString, startDate, endDate);
    }
    public String getProductId() {
        return productId;
    }
    public int getUploadSpeed() {
        return uploadSpeed;
    }
    public int getDownloadSpeed() {
        return downloadSpeed;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public static String getStringFormat() {
        return stringFormat;
    }
    public static String getSpeedFormat() {
        return speedFormat;
    }
}

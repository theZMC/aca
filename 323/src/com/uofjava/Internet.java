package com.uofjava;

import java.time.LocalDate;

public class Internet {
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
}

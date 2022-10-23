package com.example;
//import net.pwall.json.parser.Parser;

//File file = new File (pathname: "C:\Users\April West\OneDrive - Neumont College of Computer Science\Documents\GitHub\StockStatementGenerator\gitstockstatement\stock.json")

// public static void importJSON(){
//     String testString = "{\"testkey\": \"This is a test\"}";
//     Object test = Parser.parser(testString);
//     System.out.println(test.toString());
// }

public class Transaction {
    private String buyCash;
    private String sellCash;
    private String sharesBought;
    private String sharesSold;
    private String stockSymbol;
    private String pricePerShare;
    private String totalAmountOfSharesBought;

    public String getBuyCash() {
        return buyCash;
    }

    public void setBuyCash (String buyCash) {
        this.buyCash = buyCash;
    }

    public String getSellCash() {
        return sellCash;
    }

    public void setSellCash (String sellCash) {
        this.sellCash = sellCash;
    }

    public String getSharesBought() {
        return sharesBought;
    }

    public void setSharesBought (String sharesBought) {
        this.sharesBought = sharesBought;
    }

    public String getSharesSold() {
        return sharesSold;
    }

    public void setSharesSold (String sharesSold) {
        this.sharesSold = sharesSold;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol (String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare (String pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public String getTotalAmountOfSharesBought() {
        return totalAmountOfSharesBought;
    }

    public void setTotalAmountOfSharesBought (String totalAmountOfSharesBought) {
        this.totalAmountOfSharesBought = totalAmountOfSharesBought;
    }

    public static void buyCash(String[] args){
        /* this is a buying transaction */
    }

    public static void sellCash(String[] args){
        /* this is used to sell transactions */
    }

    public static void shareBought(String[] args){
        /* 
        cashStart = "";
        stockStart = "";
        numberOfShares;
        * sharePrice;
        * totalValue = numberOfShares * sharePrice;
        * cashTotal = cashStart + totalValue;
        */
        /* this is the price per share and the shares bought */
    }

    public static void sharesSold(String[] args){
        /* 
        cashStart = "";
        stockStart = "";
        numberOfShares;
        * sharePrice;
        * totalValue = numberOfShares * sharePrice;
        * cashTotal = cashStart - totalValue;
        */
        /* this is the shares that have been sold */
    }
}

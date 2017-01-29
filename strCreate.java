public  class strCreate  {
    // was public  class strCreate  extends CBfreq{
    static   String make1 (int chn, int f ){
        String message1 = "";
        StringBuilder sb1 = new StringBuilder(message1);
        sb1.append("M ch ");
        sb1.append(chn);
        sb1.append(" F = ");
        sb1.append(f/1000);
        sb1.append(".");
        sb1.append(f%1000);
        sb1.append("MHz\n");  
        return sb1.toString();
    }
}

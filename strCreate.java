public  class strCreate  {
    // was public  class strCreate  extends CBfreq{
    // so need to find out the pros and cons of 'extends other class'
    // https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
    // https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html
    // https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html
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

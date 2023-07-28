public class first{
    public static void main(String[] args) {
        for(int i=0;i<1;i++){
            String side = Math.random()>0.4?"Left":"Right";
            int rowNumber = (int)Math.ceil(Math.random()*30);
            int columnNumber = (int)Math.ceil(Math.random()*10);
            System.out.println(side+"-"+rowNumber+"-"+columnNumber);
        }
    }
}
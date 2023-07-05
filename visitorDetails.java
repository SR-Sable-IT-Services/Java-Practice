class Visitor{

        private String deviceType;
        private int ip;
        private String browser;

    public void setDeviceType(String deviceType)
        {
          this.deviceType=deviceType;
        }

    public void setIp(int ip)
        {
           this.ip=ip;
        }

    public void setBrowser(String browser)
        {
           this.browser=browser;
        }

    public String getDeviceType()
       {
           return deviceType;
       }

    public int getIp()
       {
           return ip;
       }

    public String getBrowser()
       {
           return browser;
       }
}

class visitorDetails{
    public static void main(String args[]){

     Visitor vd=new Visitor();
     vd.setDeviceType("Iphone");
     vd.setIp(123456);
     vd.setBrowser("Chrome");

   System.out.println("User's Device Name is : "+vd.getDeviceType());
   System.out.println("User's IP is : "+vd.getIp());
   System.out.println("User's Browser : "+vd.getBrowser());

}
}
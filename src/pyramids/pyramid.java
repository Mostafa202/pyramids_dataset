package pyramids;

public class pyramid{

        double height;
        String modern_name,pharaoh,site;

        pyramid(double height,String modern_name,String pharaoh,String site){

        this.height=height;
        this.modern_name=modern_name;
        this.pharaoh=pharaoh;
        this.site=site;


        }
        public void setHeight(double height){
                this.height=height;
                }
        public void setModern_name(String modern_name){
                this.modern_name=modern_name;
                }
        public void setPharaoh(String pharaoh){
                this.pharaoh=pharaoh;
                }
        public void setSite(String site){
                this.site=site;
                }
        public double getHeight(){
                return height;
                }
        public  String getModern_name(){
                return modern_name;
                }
        public String getPharaoh(){
                return pharaoh;
                }
        public String getSite(){
                return site;
                }



        }

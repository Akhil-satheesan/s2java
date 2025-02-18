

class product{
    String pname;
    int pcode,pr;


     product(int code,String name,int price){
        pcode=code;
        pname=name;
        pr=price;

    }
    void display(){
        System.out.println("product code:"+pcode);
        System.out.println("product Name:"+pname);
        System.out.println("product Price:"+pr);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        product p1=new product(1001,"Smartphone",4500);
        product p2=new product(1002,"Laptop",55500);
        product p3=new product(1003,"Talet",4000);
        System.out.println("Product Details");
        p1.display();
        p2.display();
        p3.display();
        product lowest;
        if(p1.pr<p2.pr&&p1.pr<p3.pr)
         lowest=p1;
        else if(p2.pr<p3.pr)
        lowest=p2;
        else 
        lowest=p3;
        System.out.println("Product with the lowest price:");
         lowest.display();
    }
    
    
}

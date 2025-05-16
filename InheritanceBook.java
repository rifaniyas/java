package rifa;



class Publisher{
    String publisher;
    Publisher(String publisher){
        this.publisher=publisher;
    }
}

class Book{
    String name;
    Publisher publisher;
    Book (String name,Publisher publisher){
        this.name=name;
        this.publisher=publisher;
    } 
}

class Literature extends Book{
    String Lit_type="Literature";

    Literature(String name,Publisher publisher){
        super(name, publisher);
    }
    void display(){
        System.out.println("Name : "+super.name);
        System.out.println("Type : "+this.Lit_type);
        System.out.println("Publisher : "+this.publisher.publisher);
    }
}

class Fiction extends Book{
    String Lit_type="Fiction";

    public Fiction(String name,Publisher publisher) {
        super(name,publisher);
    }
    void display(){
        System.out.println("Name : "+super.name);
        System.out.println("Type : "+this.Lit_type);
        System.out.println("Publisher : "+this.publisher.publisher);
    }
    
}

public class InheritanceBook {

    public static void main(String[] args) {
        Publisher lp=new Publisher("s.chand");
        Literature l=new Literature("As you like it", lp);
        l.display();
        Publisher fb=new Publisher("Tata McGraw Hill");
        Fiction f=new Fiction("Tempest", fb);
        f.display();
    }
}
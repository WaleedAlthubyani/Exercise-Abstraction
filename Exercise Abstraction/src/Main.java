public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("book1",15,"Waleed");
        Book b2 = new Book();
        b2.setName("The end");
        b2.setPrice(100);
        b2.setAuthor("Mohammed");

        Movie m1 = new Movie("Interstellar",72.25,"Christopher Nolan");
        Movie m2 = new Movie();
        m2.setName("Oppenheimer");
        m2.setDirector("Christopher Nolan");
        m2.setPrice(56.26);

        //this should be in a toString method.
        System.out.println("Book name: " + b1.getName() +"\nBook author: "+ b1.getAuthor()+ "\nBook original price: "+b1.getPrice()+" Riyals"+"\nAfter discount: " + b1.getDiscount()+" Riyals");
        System.out.println();
        System.out.println("Book name: " + b2.getName() +"\nBook author: "+ b2.getAuthor()+ "\nBook original price: "+b2.getPrice()+" Riyals"+"\nAfter discount: " + b2.getDiscount()+" Riyals");
        System.out.println();
        System.out.println("Movie name: "+m1.getName()+"\nMovie director: "+m1.getDirector()+"\nMovie original price: "+m1.getPrice()+" Riyals"+"\nAfter discount: " + m1.getDiscount()+" Riyals");
        System.out.println();
        System.out.println("Movie name: "+m2.getName()+"\nMovie director: "+m2.getDirector()+"\nMovie original price: "+m2.getPrice()+" Riyals"+"\nAfter discount: " + m2.getDiscount()+" Riyals");

    }
}
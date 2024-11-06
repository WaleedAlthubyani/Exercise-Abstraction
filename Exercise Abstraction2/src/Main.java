public class Main {
    public static void main(String[] args) {

        MovablePoint m1= new MovablePoint(0,0,0,0);
        m1.setX(1);
        m1.setY(1);
        m1.setxSpeed(2);
        m1.setySpeed(5);


        System.out.println("The dot is at ("+m1.getX()+","+m1.getY()+") its speed along the x axis is: "+m1.getxSpeed()+" and its speed along the y axis is: "+m1.getySpeed());
        m1.moveUP();
        m1.moveLeft();
        System.out.println("After moving up once then left once it is now at ("+m1.getX()+","+m1.getY()+")");
        m1.moveRight();
        m1.moveRight();
        m1.moveDown();
        m1.moveDown();
        m1.moveDown();
        m1.moveDown();
        System.out.println("After moving right twice and down 4 times it is now at ("+m1.getX()+","+m1.getY()+")");
    }
}
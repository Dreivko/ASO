
package composite;

public class Client {
    public static void main(String [] args ){
        
        IBox _CD = new CD();
        _CD.addIBox();
        
        IBox _DVD = new DVD();
        _DVD.addIBox();
        _DVD.addIBox();
        
        IBox _Book = new Book();
        _Book.addIBox();
        _Book.addIBox();
        _Book.addIBox();
        
        IBox _Group = new Box();
        _Group.addItem(_CD);
        _Group.addItem(_DVD);
        _Group.addItem(_Book);
        
        System.out.println("Weight of the Group is: " + _Group.getWeight());
        
        IBox _Book2 = new Book();
        _Book2.addIBox();
        _Book2.addIBox();
        _Book2.addIBox();
        _Book2.addIBox();
        
        IBox _Group2 = new Box();
        _Group2.addItem(_Group);
        _Group2.addItem(_Book2);
        
        System.out.println("Weight of the Group 2 is: " + _Group2.getWeight());
        
    }
}

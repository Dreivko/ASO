
package composite;

public class Client {
    public static void main(String [] args ){
        
        IBox _CD = new CD();
        _CD.AddIBox();
        
        IBox _DVD = new DVD();
        _DVD.AddIBox();
        _DVD.AddIBox();
        
        IBox _Book = new Book();
        _Book.AddIBox();
        _Book.AddIBox();
        _Book.AddIBox();
        
        IBox _Group = new Box();
        _Group.AddItem(_CD);
        _Group.AddItem(_DVD);
        _Group.AddItem(_Book);
        
        System.out.println("Weight of the Group is: " + _Group.GetWeight());
        
        IBox _Book2 = new Book();
        _Book2.AddIBox();
        _Book2.AddIBox();
        _Book2.AddIBox();
        _Book2.AddIBox();
        
        IBox _Group2 = new Box();
        _Group2.AddItem(_Group);
        _Group2.AddItem(_Book2);
        
        System.out.println("Weight of the Group 2 is: " + _Group2.GetWeight());
        
    }
}

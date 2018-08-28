class Cons 
{
    private String Institute;
    private int id = 101; 
    public Cons()
    {
        System.out.println("Default constructor. " +this.id);
    }
    public Cons(String Institute)
    {
        this();
        Cons instance = new Cons();
        this.Institute = Institute;
    }
}
class Constructor
{
    public static void main(String[] args)
    {
        Cons t1 = new Cons();
        System.out.println("Calling default constructor of the same class through parameterized one:");
        Cons t2 = new Cons("Institute");
	
    }
}
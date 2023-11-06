class K
{
    void manipulation(String i)
    {        
        {
            System.out.println(i.toUpperCase());
        }
    }
}
class L extends K
{
    void manipulation(String j)
    { 
        String h = "Hello";
        System.out.println(j+h);
    }
}
class Change
{
    public static void main(String[] args) 
    {
        L l = new L();
        K k = new K();
        k.manipulation("uppercase");
        l.manipulation("concatenate");    
    }
}
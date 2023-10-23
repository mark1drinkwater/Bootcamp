package OCP.Chapter10.advancedStreams;

public class GroupPartitionMap {
    public static void main(String[] args) {

    }
}

class Test
{
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer("geeks");
        // gksforgeeks
        StringBuffer b = new StringBuffer("forgeeks");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}

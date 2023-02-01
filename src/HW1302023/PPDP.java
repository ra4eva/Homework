package HW1302023;

public class PPDP {
    public String pub;
    public String def;
    public String pro;
    public String pri;

    public PPDP (String pu, String d, String pr, String p) {
        pub=pu;
        def=d;
        pro=pr;
        pri=p;
    }

    PPDP (String pu, String d, String pr) {
        pub=pu;
        def=d;
        pro=pr;
    }

    protected PPDP (String pu, String d) {
        pub=pu;
        def=d;
    }

    private PPDP (String pu) {
        pub=pu;
    }

    public static void main(String[] args) {
        PPDP a=new PPDP("Public","Default","Protected","Private");
        PPDP a1=new PPDP("Public","Default","Protected");
        PPDP a2=new PPDP("Public","Default");
        PPDP a3=new PPDP("Public");
    }
}


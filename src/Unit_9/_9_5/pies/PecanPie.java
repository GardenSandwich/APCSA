package Unit_9._9_5.pies;

public class PecanPie extends Pie{
    private String syrupType;

    public PecanPie (int slices, String syrupType)
    {
        super("Pecan", slices);
        this.syrupType = syrupType;
    }

    public String getSyrupType()
    {
        return syrupType;
    }
}

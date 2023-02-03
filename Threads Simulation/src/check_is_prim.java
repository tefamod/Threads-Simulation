import javax.lang.model.type.NullType;

public class check {
    public boolean check_res;
    check (int n)
    {
        int i = 2;
        while (i<=(n/2))
        {
            if ((n%i) == 0)
            {
                check_res = false;
                break;
            }
            i+=1;
        }
        if (i>(n/2))
            check_res = n != 1 && n != 0;
    }
}

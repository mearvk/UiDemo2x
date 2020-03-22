package browser.memory;

import java.util.HashMap;

public class Bodhi
{
    public static Bodhi ref;

    private HashMap<String, Object> map = new HashMap();

    public Bodhi(String name)
    {
        Bodhi.ref = this;

        Bodhi.ref.push(name, this);
    }

    public void push(String name, Object object)
    {
        this.map.put(name, object);

        return;
    }

    public Object pull(String name)
    {
        return this.map.get(name);
    }
}

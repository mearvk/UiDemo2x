package browser.system;

import browser.memory.Bodhi;

public class System
{
    public Bodhi bodhi = new Bodhi("//system/memory");

    public System(String system_url, String memory_url)
    {
        Bodhi.ref.push(system_url, this);

        Bodhi.ref.push(memory_url, this.bodhi);
    }

    public static void main(String...args)
    {
        System system = new System("//system", "//memory");
    }

    public void push(String name, Object object)
    {
        Bodhi.ref.push(name, object);
    }

    public Object pull(String name)
    {
        return Bodhi.ref.pull(name);
    }
}


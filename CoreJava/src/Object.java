class Computer
{
	public void music()
	{
		System.out.println("Playing Music...");
	}
	public int profit(int cost, int sell)
	{
		if(sell > cost) return sell - cost;
		return 0;
	}
}


public class Object {

	public static void main(String[] args) {
		
		Computer comp;
		comp = new Computer();
		comp.music();
		int profit = comp.profit(12, 20);
		System.out.println(profit);

	}

}

package learn.common.handlers;

import java.util.Vector;

import learn.common.Menu;

public class MainMenuHandler implements IHandler {

	private Menu menu;
	
	public MainMenuHandler()
	{
		Vector<String> menuData = new Vector<String>();
		menuData.add("Sorting");
		menuData.add("Search");
		menuData.add("DS");
		menuData.add("Java Features");
		menuData.add("Threads");

		this.menu = new Menu(menuData, "Main Menu", this);
	}

	@Override
	public Menu getMenu() {
		return menu;
	}

	@Override
	public IHandler handle(int index) {
		IHandler handler = null;
		switch (index)
		{
		case 0:
		{
			handler = new SortHandler();
			break;
		}
		case 1:
		{
			handler = new SearchHandler();
			break;
		}
		case 2:
		{
			handler = new DataStructuresHandler();
			break;
		}
		case 3:
		{
			printJavaFeatures();
			break;
		}
		case 4:
		{
			handler = new ThreadHandler();
			break;
		}
		}
		
		return handler;
	}

	protected void printJavaFeatures()
	{
		System.out.println("JAVA 5:");
		System.out.println(">> Generics");
		System.out.println(">> For/in loop");
		System.out.println(">> Autoboxing/Unboxing");
		System.out.println(">> Typesafe Enums");
		System.out.println(">> Varargs");
		System.out.println(">> Static Import");
		System.out.println(">> Annotations (Metadata)");
		System.out.println(">> Covariant return types");
		System.out.println();
		
		System.out.println("JAVA 8:");
		System.out.println(">> forEach() method in Iterable interface");
		System.out.println(">> default and static methods in Interfaces");
		System.out.println(">> Functional Interfaces and Lambda Expressions");
		System.out.println(">> Java Stream API for Bulk Data Operations on Collections");
		System.out.println(">> Java Time API");
		System.out.println(">> Collection API improvements");
		System.out.println(">> Concurrency API improvements");
		System.out.println(">> Java IO improvements");
	}
}

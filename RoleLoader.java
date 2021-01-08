import MainWindow;
import Widget;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RoleLoader {
    public Widget createManager()
    {
        return null;
    }

    public Widget createTester()
    {
        return null;
    }

    public static void main(String[] args)
    {
        Display display= new Display();
        Shell shell = new Shell(display);
        MainWindow window = new MainWindow(shell);
        window.Run();
    }
}

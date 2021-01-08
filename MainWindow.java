import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MainWindow {
    Display display;

    public MainWindow(Shell oldShell)
    {
        display=oldShell.getDisplay();
        oldShell.close();
    }

    public void Run()
    {
        Shell shell=new Shell(display);
        shell.setLayout(new RowLayout(SWT.VERTICAL));
        shell.setSize(300 ,300);

        Button button1=new Button(shell,SWT.NONE);
        button1.setText("Manager");
        button1.setLayoutData(new RowData(275,60));

        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("Tester");
        button2.setLayoutData(new RowData(275,60));


        button1.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                ManagerWidget widget =new ManagerWidget(shell);
            }
        });

        button2.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                TesterWidget widget = new TesterWidget(shell);
            }
        });

        shell.open();
        while (!shell.isDisposed())
        {
            if (!display.readAndDispatch())
                display.sleep();
        }

    }

    public void injectManager(Widget widget)
    {

    }

    public void injectTester(Widget widget)
    {

    }

    public void Exit()
    {

    }

    public void onManager()
    {

    }

    public void onTester()
    {

    }
}

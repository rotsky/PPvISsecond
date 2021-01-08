
import Tester;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class TesterWidget extends Widget {
    private Tester tester;

    public TesterWidget(Shell old_shell) {
        super(old_shell);
    }

    @Override
    public void backToMain() {

    }

    @Override
    public void checkEvents() {

    }

    @Override
    public void update() {
        shell.setLayout(new RowLayout(SWT.VERTICAL));

        Composite composite = new Composite(shell,SWT.NONE);
        RowLayout layout=new RowLayout(SWT.VERTICAL);
        layout.marginLeft=200;
        composite.setLayout(layout);
        Label label1 =new Label(composite,SWT.NONE);
        label1.setText("money:xxx");

        Label label2 =new Label(composite,SWT.NONE);
        label2.setText("exp:xxx");

        Button button1=new Button(shell, SWT.NONE);
        button1.setText("Add Money");
        button1.setLayoutData(new RowData(275,60));

        Button button2 = new Button(shell,SWT.NONE);
        button2.setText("Add Player");
        button2.setLayoutData(new RowData(275,60));

        Button button3=new Button(shell,SWT.NONE);
        button3.setText("Back");
        button3.setLayoutData(new RowData(275,60));

        button3.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event1) {
                MainWindow widget =new MainWindow(shell);
                widget.Run();
            }
        });
    }

    protected void OnTeam()
    {

    }

    protected void OnTransfer()
    {

    }

    protected void OnMatch()
    {

    }

    protected void OnSwap()
    {

    }

    protected void OnSell()
    {

    }

    protected void OnBuy()
    {

    }

    protected void back()
    {

    }

    protected void OnTeamDone()
    {

    }

    protected void OnTransferDone()
    {

    }

    protected void OnTestDone()
    {

    }

    protected void OnTraining()
    {

    }

    protected void OnTest()
    {

    }

    protected void OnAddMoney()
    {

    }

    protected void OnAddPlayer()
    {

    }
}

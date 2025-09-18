package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.command.Command;

public class CommandActionListener implements ActionListener {
	
	private Command command;

	public CommandActionListener(Command command) {
		this.command = command;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		command.execute();
	}

}

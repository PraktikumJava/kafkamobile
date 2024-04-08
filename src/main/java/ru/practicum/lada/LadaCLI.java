package ru.practicum.lada;

import org.jline.terminal.Terminal;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.practicum.lada.devices.ECU;

@ShellComponent
public class LadaCLI {

    private final Terminal terminal;
    private final ECU ecu;

    public LadaCLI(Terminal terminal, ECU ecu) {
        this.terminal = terminal;
        this.ecu = ecu;
    }

    @ShellMethod(value = "проверить все системы")
    public void check() {
        message(ecu.check());
    }

    @ShellMethod(value = "запуск")
    public void start() {
        message(ecu.start());
    }


    private void message(String message) {
        terminal.writer().println();
        terminal.writer().println(message);
        terminal.writer().flush();
    }

}

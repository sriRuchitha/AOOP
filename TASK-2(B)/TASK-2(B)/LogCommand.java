// Command implementation that delegates to a handler
public class LogCommand implements Command {
    private LogHandler handler;

    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(String message) {
        handler.handleRequest(message);
    }
}
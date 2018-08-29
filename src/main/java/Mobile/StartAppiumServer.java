package Mobile;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

public class StartAppiumServer {
	private String nodePath = "/usr/local/bin/node";
	private String mainPath = "/Users/anoopambunhi/node_modules/appium/build/lib/main.js";
	private String ip = "127.0.0.1";
	private String port = "4723";

	public void startServer() {

		// Setup Appium Server Variables
		CommandLine cmd = new CommandLine(nodePath);
		cmd.addArgument(mainPath);
		cmd.addArgument("--address");
		cmd.addArgument(ip);
		cmd.addArgument("--port");
		cmd.addArgument(port);

		// Launch the Appium Server
		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(cmd, handler);
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StartAppiumServer server = new StartAppiumServer();
		server.startServer();
		server.stopServer();
	}

}

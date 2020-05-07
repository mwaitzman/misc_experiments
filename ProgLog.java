package misc_experiments;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
public class ProgLog {
  public ProgLog(String callerProgramName) {
    this.creationTime =
    this.logFileName = creationTime + "_" + callerProgramName + ".log";
  }
  public static void main(String[] args) {
    File LogFile = new File(logsFolder + logFileName);
    FileWriter logFileWriter = new FileWriter(logFile);
/*    boolean ProgLogshouldRun = true;
    while (ProgLogshouldRun) {

    }*/
  }
  void LogRaw(String dataToLog) {
    logFileWriter.write(dataToLog);
  }
  void Log(String dataToLog) {
    logFileWriter.write("\n{[" + getCurrentTime() + "]:[" + dataToLog + "]}");
  }
  void close() {
    //finalize stuff
  }
}
/*class Log {
  String creationDate;
  String name;

}*/

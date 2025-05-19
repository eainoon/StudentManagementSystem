public class Main {
    public static void main(String[] args) {
        // Start the GUI in the Event Dispatch Thread (best practice for Swing)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI(); // Assumes MainGUI sets up and shows the GUI in its constructor
            }
        });
    }
}

//In Assignment 2, Eainan is continuing this from Eainan in Assignment 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchApp {
    public static void main(String[] args) {
        // Создаем основное окно
        JFrame frame = new JFrame("Football Match");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        // Начальные значения
        int[] scores = {0, 0}; // 0 - AC Milan, 1 - Real Madrid
        JLabel resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        // Кнопка для AC Milan
        JButton acMilanButton = new JButton("AC Milan");
        acMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scores[0]++;
                updateLabels();
            }

            private void updateLabels() {
                resultLabel.setText("Result: " + scores[0] + " X " + scores[1]);
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateWinnerLabel();
            }

            private void updateWinnerLabel() {
                if (scores[0] > scores[1]) {
                    winnerLabel.setText("Winner: AC Milan");
                } else if (scores[0] < scores[1]) {
                    winnerLabel.setText("Winner: Real Madrid");
                } else {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        // Кнопка для Real Madrid
        JButton realMadridButton = new JButton("Real Madrid");
        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scores[1]++;
                updateLabels();
            }

            private void updateLabels() {
                resultLabel.setText("Result: " + scores[0] + " X " + scores[1]);
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateWinnerLabel();
            }

            private void updateWinnerLabel() {
                if (scores[0] > scores[1]) {
                    winnerLabel.setText("Winner: AC Milan");
                } else if (scores[0] < scores[1]) {
                    winnerLabel.setText("Winner: Real Madrid");
                } else {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        // Добавляем компоненты в окно
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(acMilanButton);
        frame.add(realMadridButton);
        frame.add(winnerLabel);

        // Отображаем окно
        frame.setVisible(true);
    }
}
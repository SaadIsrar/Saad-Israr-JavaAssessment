import java.util.Random;
import java.util.Scanner;
            public class Theadventureofbarrenmoor {

                    Scanner input;
                    int line;
                    int sequence;
                    Random rng;
                    String[][] textgame;
                    int textSize;
                    int spawnPoint;
                    int playerSaadLocation;
                    int playerPeterLocation;
                    boolean stillPlaying;
                    String direction;

                    public void main (String[] args)
                    {
                        System.out.println("");

                        Theadventureofbarrenmoor gameboard = new Theadventureofbarrenmoor();

                        System.out.println("Insert the input location of the player Saad & player Peter");
                        Scanner input = new Scanner(System.in);
                        String line = input.nextLine();

                        System.out.println("Insert the input direction covered by the player Saad & player Peter");
                        line = input.nextLine();


                        this.textgame();

                        gameboard.playerLocation();
                    }
                    public int textgame()
                    {
                       textSize = new String[line][sequence];

                        for (int line = 0; line < textSize.length; line++)
                        {
                            for (int column = 0; column < text[line].length; column++)
                            {
                                board[line][column] = "-";
                            }
                        }

                        textSize = line * sequence;

                        return textSize;
                    }
                    public void printBoard()
                    {
                        for (int line = 0; line < board.length; line++)
                        {
                            for (int column = 0; column < board[line].length; column++)
                            {
                                System.out.print(board[line][column] + " ");
                            }
                            System.out.println("");
                        }
                    }
                    public int playerSpawn()
                    {
                        spawnPoint = Math.round(line / 2);

                        return spawnPoint;
                    }
                    public void playerLocation()
                    {
                        playerSpawn();

                        Random rng = new Random();

                        int n1 = rng.nextInt(line);

                        int n2 = rng.nextInt(sequence);

                        board[n1][n2] = Integer.toString(8);


                        stillPlaying = true;

                        playerSaadLocation = spawnPoint;

                        playerPeterLocation = spawnPoint;

                        basicBoard();

                        while(stillPlaying == true)
                        {
                            for(int row = 0; line < board.length; line++)
                                for(int column = 0; column < board[line].length; column++)
                                {
                                    if(line == playerSaadLocation && column == playerPeterLocation)
                                    {
                                        board[line][column] = "*";
                                    }
                                    else
                                    {
                                        board[line][column] = "-";
                                    }
                                }
                            printBoard();


                            System.out.println("Which cardinal direction does the player wants to travel to? ('North', 'South', 'East' or 'West'?)");

                            Scanner dir = new Scanner(System.in);

                            direction = dir.nextLine();

                            if(direction.equalsIgnoreCase("North"))
                            {
                                playerSaadLocation--;

                                System.out.println("Player move  towards North.");
                            }
                            else if(direction.equalsIgnoreCase("East"))
                            {
                                playerPeterLocation++;

                                System.out.println("Player move towards East.");
                            }
                            else if(direction.equalsIgnoreCase("South"))
                            {
                                playerSaadLocation++;

                                System.out.println("Player move towards South.");
                            }
                            else if(direction.equalsIgnoreCase("West"))
                            {
                                playerPeterLocation--;

                                System.out.println("Player move towards West.");
                            }
                            else
                            {
                                System.out.println("Input one of the player's cardinal directions!");
                            }

                            if(playerSaadLocation == n1 && playerPeterLocation == n2)
                            {

                                dir.close();

                                System.out.println("\nHoooray! You Win & Found the Treasure\n");

                                System.out.println(" ");

                                stillPlaying = false;

                            }
                            else

                            {
                                double distanceX = n1 - playerSaadLocation;

                                double distanceY = n2 - playerPeterLocation;

                                double squareDistX = distanceX * distanceX;

                                double squareDistY = distanceY * distanceY;

                                double distFromWin = Math.sqrt(squareDistX + squareDistY);

                                System.out.println("Player is " + distFromWin + "m away from the treasure.");
                                continue;
                            }
                        }
                    }
                }

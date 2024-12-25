 package com.mulchat.demo.Services;

// import java.io.IOException;
// import java.util.Arrays;
// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.google.cloud.vertexai.VertexAI;
// import com.google.cloud.vertexai.api.GenerateContentResponse;
// import com.google.cloud.vertexai.api.GenerationConfig;
// import com.google.cloud.vertexai.api.HarmCategory;
// import com.google.cloud.vertexai.api.SafetySetting;
// import com.google.cloud.vertexai.generativeai.GenerativeModel;
// import com.google.cloud.vertexai.generativeai.ResponseHandler;
// import com.mulchat.demo.Entities.Chat;
// import com.mulchat.demo.Entities.Users;

// @Service
 public class GeminiService {

<<<<<<< HEAD
//     private static final String PROJECT_ID = "graphite-pad-433303-r4";
//     private static final String LOCATION = "us-central1";
//     private static final String MODEL_NAME = "gemini-1.5-flash-001";
=======
    private static final String PROJECT_ID = "";
    private static final String LOCATION = "";
    private static final String MODEL_NAME = "gemini-1.5-flash-001";
    
>>>>>>> 643499919b62cff9e4c851c10fbba2a90b85a6e7

//     public String generateBotResponse(Chat chat, Users bot, String userMessage) throws IOException {

//         // Check if the user message starts with the bot's name
//         String personalityPrompt = getPersonalityPrompt(bot.getPersonality(), userMessage);

//         if (personalityPrompt.isEmpty()) {
//             // If the message doesn't start with the bot's name, return an empty response or a default message
//             return "";
//         }

//         // Combine the user's message with the bot's personality prompt
//         String textPrompt = String.format("%s %s", personalityPrompt, userMessage);
        

//         // Generate the response using the Gemini model with safety settings and generation config
//         return textInput(PROJECT_ID, LOCATION, MODEL_NAME, textPrompt);
//     }

//     private String getPersonalityPrompt(String personality, String userMessage) {
//         switch (personality.toLowerCase()) {
//             case "batman":
//                 if (userMessage.toLowerCase().startsWith("batman")) {
//                     return "Respond like Batman in 10 words or less.";
//                 }
//                 break;
//             case "joker":
//                 if (userMessage.toLowerCase().startsWith("joker")) {
//                     return "Respond like Joker in 10 words or less.";
//                 }
//                 break;
//             case "superman":
//                 if (userMessage.toLowerCase().startsWith("superman")) {
//                     return "Respond like Superman in 10 words or less.";
//                 }
//                 break;
//             case "iron man":
//                 if (userMessage.toLowerCase().startsWith("iron man")) {
//                     return "Respond like Iron Man in 10 words or less.";
//                 }
//                 break;
//             default:
//                 if (userMessage.toLowerCase().startsWith("gordon")) {
//                     return "Respond in a neutral tone in maximum 10 words or less.";
//                 }
//                 break;
//         }
//         // Return an empty string if the message does not start with the character's name
//         return "";
//     }

//     // Passes the provided text input to the Gemini model and returns the text-only response.
//     public static String textInput(String projectId, String location, String modelName, String textPrompt) throws IOException {
//         VertexAI vertexAI = new VertexAI(projectId, location);

//         // Configure generation settings
//         GenerationConfig generationConfig = GenerationConfig.newBuilder()
//                 .setMaxOutputTokens(8192)
//                 .setTemperature(1F)
//                 .setTopP(0.95F)
//                 .build();

//         // Configure safety settings
//         List<SafetySetting> safetySettings = Arrays.asList(
//                 SafetySetting.newBuilder()
//                         .setCategory(HarmCategory.HARM_CATEGORY_HATE_SPEECH)
//                         .setThreshold(SafetySetting.HarmBlockThreshold.BLOCK_MEDIUM_AND_ABOVE)
//                         .build(),
//                 SafetySetting.newBuilder()
//                         .setCategory(HarmCategory.HARM_CATEGORY_DANGEROUS_CONTENT)
//                         .setThreshold(SafetySetting.HarmBlockThreshold.BLOCK_MEDIUM_AND_ABOVE)
//                         .build(),
//                 SafetySetting.newBuilder()
//                         .setCategory(HarmCategory.HARM_CATEGORY_SEXUALLY_EXPLICIT)
//                         .setThreshold(SafetySetting.HarmBlockThreshold.BLOCK_MEDIUM_AND_ABOVE)
//                         .build(),
//                 SafetySetting.newBuilder()
//                         .setCategory(HarmCategory.HARM_CATEGORY_HARASSMENT)
//                         .setThreshold(SafetySetting.HarmBlockThreshold.BLOCK_MEDIUM_AND_ABOVE)
//                         .build()
//         );

//         // Build the GenerativeModel with safety and generation config
//         GenerativeModel model = GenerativeModel.newBuilder()
//                 .setModelName(modelName)
//                 .setVertexAi(vertexAI)
//                 .setGenerationConfig(generationConfig)
//                 .setSafetySettings(safetySettings)
//                 .build();

//         // Generate the content and return the response
//         GenerateContentResponse response = model.generateContent(textPrompt);
//         return ResponseHandler.getText(response);
//     }

//     // Method to generate a new message ID (for demonstration purposes)
//     public Long generateNewMessageId() {
//         // This would typically involve saving the message to a database and returning the generated ID.
//         // Here, we'll just return a mock ID for demonstration.
//         return System.currentTimeMillis();
//     }
 }

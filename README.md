# FU04

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://img.shields.io/badge/Status-Under%20Development-orange" />
    <img src="https://img.shields.io/badge/Platform-Android-3DDC84?logo=android)"/>
    <img src="https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white" />
  </a>
</p>

## Built With
<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=blender,unity,androidstudio,kotlin,gradle,git,github&perline=4" />
  </a>
</p>

## Project Description

FO04 is an Android augmented reality application developed using Unity game engine, Vuforia SDK, and Android Studio with Kotlin and ARCore. The project currently demonstrates the deployment of a simple spaceship 3D model with a repetitive animation onto a designated image target, specifically an image referred to as "earth," within a user's environment.<br>

As the developer, the main purpose for building this app was to learn how to implement augmented reality in an Android application using the Unity game engine and the Vuforia SDK. This project serves as a practical exercise to understand the integration of these technologies and the process of deploying and interacting with 3D models in an AR context on Android devices.<br>
The FO04 application and its repository serve as a solution for learning and documenting the process of AR implementation on Android using Unity and Vuforia. The application provides a working example of setting up an AR scene, recognizing an image target, and displaying a 3D model anchored to that target. The repository itself acts as a resource for developers to examine the codebase and understand the steps involved in building such an application.

## Target Users

The primary target users for this project repository and the FO04 application demonstration are developers who are interested in learning about augmented reality implementation in Android projects, specifically using the Unity game engine and Vuforia SDK, and those who want to explore how to interact with 3D models within a real-world environment through AR.

## Project Scope

The current scope of the FO04 application includes the following key features:

* **Locally Deployed 3D Model:** A 3D model is included and deployed locally within the Android app.
* **Fully Functional AR:** The application provides a working augmented reality experience.
* **Start Screen:** A initial screen with a button is provided to launch the Unity AR experience.
* **Camera Interface:** Upon launching the AR mode, a camera view is presented for scanning the environment.
* **Image Target Recognition:** The application is configured to recognize a specific image target ("earth").
* **Model Deployment:** The 3D spaceship model is deployed and anchored onto the recognized image target.

## Objectives of the Project

The main objective of this project for the developer is to learn and document the process of implementing augmented reality in an Android app using the Unity game engine, Vuforia SDK, and the capabilities provided by Kotlin and ARCore. The project aims to provide a hands-on learning experience and a documented journey through the development process.

## Technologies Used

* **Unity game engine:** Used for creating the augmented reality scene, importing and managing the 3D model, and handling the AR rendering and user interaction logic within the AR environment.
* **Vuforia SDK:** Integrated within Unity to provide image target recognition capabilities, allowing the application to detect the designated "earth" image and anchor the augmented reality content onto it.
* **Android Studio:** The Integrated Development Environment (IDE) used for developing the native Android parts of the application, including the initial launch screen and integrating the exported Unity project as a library.
* **Kotlin:** The programming language used for developing the native Android components of the app, such as the start screen and handling the transition to the Unity-based AR experience.
* **ARCore:** Leveraged to provide core augmented reality functionality on the Android device, enabling the app to understand the environment, track the device's position and orientation, and facilitate the display of augmented content.

## App Workflow

The typical workflow for a user interacting with the FO04 app is as follows:

1.  **Open the App:** After installation, the user launches the FO04 application.
2.  **Start Screen:** A first screen appears with a button to initiate the augmented reality experience.
3.  **Launch AR:** The user clicks the button to launch the Unity-based AR view.
4.  **Camera View:** A blank camera view is displayed, prompting the user to scan their environment.
5.  **Scan Image Target:** The user points the device's camera towards the designated image target ("earth").
6.  **Model Deployment:** Once the image target is recognized by Vuforia, the 3D spaceship model is deployed and becomes visible, anchored on top of the image target in the augmented reality view.

## Installation (For Users)

This repository may provide the ready-to-install Android Application Package (APK) file for users in the [Releases tab](YOUR_RELEASE_PAGE_LINK_HERE - *You will need to add the actual link*). Since you are downloading the app directly from GitHub and not the Google Play Store, you will need to follow these steps to install it on your Android device:

1.  **Download the APK:**
    * Go to the [Releases tab](YOUR_RELEASE_PAGE_LINK_HERE - *You will need to add the actual link*) of this GitHub repository.
    * Download the latest APK file available for the app.

2.  **Enable Installation from Unknown Sources:**
    * For security reasons, Android devices typically block installations from sources other than the Google Play Store by default. You need to temporarily enable installation from unknown sources for your browser or file manager app (depending on how you downloaded the APK).
    * The exact steps may vary slightly depending on your Android version and device manufacturer, but generally, you can find this setting in:
        * `Settings` > `Apps & notifications` > `Advanced` > `Special app access` > `Install unknown apps`
        * Find the app you used to download the APK (e.g., Chrome, Files) and toggle the "Allow from this source" option.
    * **Remember to disable this setting after installing the app for security.**

3.  **Install the APK:**
    * Locate the downloaded APK file on your device (usually in the "Downloads" folder).
    * Tap on the APK file to start the installation process.
    * Review the permissions requested by the app and tap "Install".

4.  **Open the App:**
    * Once the installation is complete, you can open FO04 from your app drawer.

## Image Target

This application uses a specific image as the target for deploying the augmented reality spaceship model. When you run the app and the camera view is active, point your device's camera at the image below:

![Image Target](YOUR_IMAGE_TARGET_LINK_HERE)

## Planned Visuals

We plan to add screenshots of the application and also embed a demo video in this README soon to showcase the augmented reality experience. Please check back later to see the app in action!

*(Note: The project is currently under development, and the visuals will reflect the current state of the application.)*

## Future Scope

Exciting plans are in progress to enhance the FO04 application beyond its current demonstration. Future development will focus on transforming it into a more interactive augmented reality gameplay experience, including:

* **User Interaction with the Model:** Implementing ways for users to directly interact with the deployed 3D spaceship model.
* **AR Shooting Mechanics:** Adding functionality for users to "shoot" in the augmented reality environment.
* **Enemy Models:** Introducing virtual enemy 3D models into the AR space.
* **AR Gameplay:** Developing core gameplay loops that involve interacting with models, shooting, and potentially engaging with enemy models in the user's real-world environment.

These additions aim to provide a more engaging demonstration of AR's potential for interactive experiences.

## Summary and Impact

FO04 is an Android augmented reality application built using Unity, Vuforia SDK, Android Studio, Kotlin, and ARCore. Currently, it serves as a foundational demonstration, allowing users to launch into a camera view where an augmented reality spaceship model with a repetitive animation is deployed onto a designated image target (the "earth" image). While its current form showcases the basic implementation of AR with 3D model deployment, the project is actively being developed towards becoming an interactive AR gameplay experience. The intended impact for users is to provide a tangible example of how these technologies can be combined to create engaging AR applications. For those who experience the app as a demonstration of future gameplay, it aims to illustrate the potential for interactive 3D models in the real world, laying the groundwork for features like user interaction, AR shooting mechanics, and engaging with virtual enemy models, ultimately demonstrating the possibilities of turning the user's environment into an interactive game space.

## Team Member

| Name          | Role           | Contact Information             |
| :------------ | :------------- | :------------------------------ |
| Ishan Parashar | Lead Developer | [My Email](ishanparashar24@gmail.com) <br> [My social link](https://linktr.ee/ishanparashar24) |

## Contact

If you have any questions, feedback, or encounter any issues with the FO04 app or the project, please feel free to reach out via email or my social links as listed in the Team Member section.

---

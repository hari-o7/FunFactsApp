# README.md

<div align="center">
  <img src="image1.jpg" alt="Image 1" width="400" />
  <img src="image2.jpg" alt="Image 2" width="400" />
</div>

## Events, State and ViewModel

1. The Compose UI elements observe the uiState variable in the UserInputViewModel.
2. User interactions trigger events (UserDataUiEvents), such as entering a username or selecting an animal.
3. The onEvent function in the UserInputViewModel processes these events and updates the uiState accordingly by creating a new state with the updated information.
4. Compose automatically recomposes the UI whenever the uiState changes, reflecting the updated state in the user interface.
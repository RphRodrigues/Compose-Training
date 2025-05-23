package br.com.rstudio.codelab1.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rstudio.designsystem.ui.theme.DesignSystemTheme

@Composable
fun OnboardingScreen(
  modifier: Modifier = Modifier,
  onContinueClick: () -> Unit
) {

  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(text = "Welcome to the basics codelab!")
    ElevatedButton(
      onClick = onContinueClick,
      modifier = modifier.padding(vertical = 24.dp)
    ) {
      Text(text = "Continue")
    }
  }
}

@Preview(showBackground = true, heightDp = 320, widthDp = 320)
@Composable
fun OnboardingScreenPreview() {
  DesignSystemTheme {
    OnboardingScreen(onContinueClick = { })
  }
}

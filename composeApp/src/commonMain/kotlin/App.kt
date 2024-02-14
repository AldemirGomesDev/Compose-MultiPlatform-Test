import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp
import navigation.NavigationScreens
import navigation.SetupNavHost

@Composable
fun App() {
    MaterialTheme {
        PreComposeApp {
            NavigationScreens()
        }
    }
}
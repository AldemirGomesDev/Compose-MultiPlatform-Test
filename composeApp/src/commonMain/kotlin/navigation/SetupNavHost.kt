package navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import screen.HomeScreen
import screen.ProfileScreen

@Composable
fun SetupNavHost() {

    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = "home",
    ) {
        scene(
            route = "home",
            navTransition = NavTransition(),
        ) {
            HomeScreen(
                onNavigateProfile = {
                    navigator.navigate("profile")
                }
            )
        }
        scene(
            route = "profile",
            navTransition = NavTransition(),
        ) {
            ProfileScreen(
                onBack = {
                    navigator.goBack()
                }
            )
        }
    }
}
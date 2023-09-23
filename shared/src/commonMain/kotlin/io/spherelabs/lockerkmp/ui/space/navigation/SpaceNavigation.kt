package io.spherelabs.lockerkmp.ui.space.navigation

import io.spherelabs.lockerkmp.navigation.Route
import io.spherelabs.lockerkmp.ui.auth.SignInRoute
import io.spherelabs.lockerkmp.ui.space.SpaceRoute
import io.spherelabs.navigation.NavHostScope
import io.spherelabs.navigation.NavigationController
import io.spherelabs.navigation.composable

fun NavigationController<Route>.navigateSpace() {
    this.navigateTo(Route.Space)
}

fun NavHostScope<Route>.spaceScreen(
    navigateToHome: () -> Unit,
) {
    this.composable<Route.Space> {
        SpaceRoute { navigateToHome.invoke() }
    }
}
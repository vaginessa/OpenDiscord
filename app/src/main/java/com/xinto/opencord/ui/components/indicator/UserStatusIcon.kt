package com.xinto.opencord.ui.components.indicator

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.with
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.xinto.opencord.R
import com.xinto.opencord.domain.usersettings.DomainUserStatus

@Composable
fun UserStatusIcon(
    userStatus: DomainUserStatus,
    isStreaming: Boolean,
    modifier: Modifier = Modifier,
) {
    val statusIcon by remember(isStreaming, userStatus) {
        derivedStateOf {
            if (isStreaming)
                R.drawable.ic_status_streaming
            else when (userStatus) {
                DomainUserStatus.Online -> R.drawable.ic_status_online
                DomainUserStatus.Invisible -> R.drawable.ic_status_invisible
                DomainUserStatus.Idle -> R.drawable.ic_status_idle
                DomainUserStatus.Dnd -> R.drawable.ic_status_dnd
            }
        }
    }

    AnimatedContent(
        targetState = statusIcon,
        transitionSpec = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Up) with slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Up) },
    ) { icon ->
        Icon(
            modifier = modifier,
            painter = painterResource(icon),
            contentDescription = null,
            tint = Color.Unspecified,
        )
    }
}

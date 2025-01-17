package io.spherelabs.anypass.ui.space

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.painterResource
import io.spherelabs.admob.GADBannerView
import io.spherelabs.anypass.BuildKonfig
import io.spherelabs.designsystem.image.RoundedImage
import io.spherelabs.designsystem.switch.CupertinoSwitch
import io.spherelabs.anypass.MR

@Composable
fun AccountRoute(
    navigateToBack: () -> Unit,
) {
    AccountScreen(navigateToBack = { navigateToBack.invoke() })
}

@Composable
fun AccountScreen(
    modifier: Modifier = Modifier,
    navigateToBack: () -> Unit,
) {
    Scaffold(
        containerColor = colorResource(MR.colors.dynamic_yellow),
        topBar = {
            Row(
                modifier = modifier.fillMaxWidth().padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = modifier.padding(start = 24.dp).size(56.dp)
                        .clip(RoundedCornerShape(24.dp))
                        .background(color = Color.Black)
                        .clickable { navigateToBack.invoke() },
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        tint = Color.White,
                        contentDescription = "Back",
                    )
                }

            }

        },
    ) { padding ->
        Column(
            modifier = modifier.fillMaxSize().padding(padding),
        ) {
            Box(
                modifier = modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center,
            ) {
                RoundedImage(
                    imageSize = 150,
                    modifier = modifier.border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = CircleShape,
                    ),
                    painter = painterResource(MR.images.avatar),
                    contentDescription = null,
                )
            }

            Spacer(modifier = modifier.height(16.dp))
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    "Behzod Halil",
                    textAlign = TextAlign.Center,
                    fontSize = 32.sp,
                    color = Color.Black,
                    fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                )
                Spacer(modifier = modifier.height(8.dp))

                Text(
                    text = "behzoddev@gmail.com",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    color = Color.Black.copy(0.5f),
                    fontFamily = fontFamilyResource(MR.fonts.googlesans.regular),
                )
            }

            Spacer(modifier.height(24.dp))

            Row(
                modifier = modifier.fillMaxWidth().padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                Row {
                    Text(
                        text = "166",
                        fontSize = 45.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )

                    Text(
                        text = "passwords",
                        fontSize = 12.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )
                }

                Column {
                    Text(
                        text = "56",
                        fontSize = 32.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )

                    Text(
                        text = "Strong",
                        fontSize = 12.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )
                }
                Column {
                    Text(
                        text = "56",
                        fontSize = 32.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )

                    Text(
                        text = "Strong",
                        fontSize = 12.sp,
                        fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                    )
                }
            }
            Spacer(modifier = modifier.height(36.dp))

            Row(
                modifier = modifier.padding(horizontal = 24.dp).fillMaxWidth().height(48.dp)
                    .clip(
                        RoundedCornerShape(16.dp),
                    ).background(color = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = modifier.padding(start = 24.dp),
                    text = "Fingerprint",
                    fontSize = 16.sp,
                    color = Color.White,
                    fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                )
                CupertinoSwitch(
                    false,
                    onCheckedChange = {},
                    modifier = modifier.padding(end = 24.dp),
                )
            }

            Spacer(modifier = modifier.height(12.dp))

            Row(
                modifier = modifier.padding(horizontal = 24.dp).fillMaxWidth().height(48.dp)
                    .clip(
                        RoundedCornerShape(16.dp),
                    ).background(color = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Text(
                    modifier = modifier.padding(start = 24.dp),
                    text = "Change password",
                    fontSize = 16.sp,
                    color = Color.White,
                    fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                )
                Image(
                    modifier = modifier.padding(end = 24.dp).size(20.dp),
                    painter = painterResource(MR.images.change_password),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = Color.White),
                )

            }

            Spacer(modifier = modifier.height(12.dp))

            Row(
                modifier = modifier.padding(horizontal = 24.dp).fillMaxWidth().height(48.dp)
                    .clip(
                        RoundedCornerShape(16.dp),
                    ).background(color = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Text(
                    modifier = modifier.padding(start = 24.dp),
                    text = "Send feedback",
                    fontSize = 16.sp,
                    color = Color.White,
                    fontFamily = fontFamilyResource(MR.fonts.googlesans.medium),
                )
                Image(
                    modifier = modifier.padding(end = 24.dp).size(20.dp),
                    painter = painterResource(MR.images.message_square),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = Color.White),
                )

            }
            Spacer(modifier.weight(1f))
            GADBannerView(modifier = modifier.padding(bottom = 16.dp), adId = BuildKonfig.AD_ID)
        }
    }

}

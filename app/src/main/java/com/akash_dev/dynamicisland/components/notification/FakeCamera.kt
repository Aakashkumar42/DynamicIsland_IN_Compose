package com.akash_dev.dynamicisland.components.notification

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FakeCamera() {
    Card(
        modifier = Modifier
            .height(30.dp)
            .width(30.dp),
        backgroundColor = Color.Gray.copy(alpha = 0.2f),
        shape = CircleShape
    ) {

    }
}
    @Preview
    @Composable
   fun FakeCameraPrevious(){
        FakeCamera()

   }

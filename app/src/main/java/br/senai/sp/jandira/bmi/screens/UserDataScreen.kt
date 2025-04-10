package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {
    var nameState = remember {
            mutableStateOf("")
        }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFFFF29ED),
                        Color(0xFFEE7CE0)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(
                    R.string.hi
                ),
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier.padding(25.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(770.dp),
                shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(bottom = 30.dp, top = 40.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Card(
                                modifier = Modifier.size(120.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(containerColor = Color(0xFF42A5F5))
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.male),
                                    contentDescription = "",
                                    modifier = Modifier
                                )
                            }
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(31.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF1E6EAB)
                                )
                            ) {
                                Text(text = stringResource(
                                    R.string.male
                                ), fontSize = 16.sp, color = Color.White)
                            }
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Card(
                                modifier = Modifier.size(120.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(containerColor = Color(0xFFFF4081))
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.female),
                                    contentDescription = "",
                                    modifier = Modifier
                                )
                            }
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(31.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFAD1F4B)
                                )
                            ) {
                                Text(text = stringResource(
                                    R.string.female
                                ), fontSize = 16.sp, color = Color.White)
                            }
                        }
                    }
                    Column (
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center
                    ){
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth().padding(30.dp),
                            shape = RoundedCornerShape(20.dp),
                            label = {
                                Text(text = stringResource(
                                    R.string.age
                                ), fontSize = 16.sp, color = Color.Gray)
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "",
                                    tint = Color(0xFFAD1F4B)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            )
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth().padding(30.dp),
                            shape = RoundedCornerShape(20.dp),
                            label = {
                                Text(text = stringResource(
                                    R.string.weight
                                ), fontSize = 16.sp, color = Color.Gray)
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Info,
                                    contentDescription = "",
                                    tint = Color(0xFFAD1F4B)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            )
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth().padding(30.dp),
                            shape = RoundedCornerShape(20.dp),
                            label = {
                                Text(text = stringResource(
                                    R.string.height
                                ), fontSize = 16.sp, color = Color.Gray)
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Face,
                                    contentDescription = "",
                                    tint = Color(0xFFAD1F4B)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            )
                        )
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFAD1F4B)
                            )
                        ) {
                            Text(text = stringResource(
                                R.string.calculatee
                            ), fontSize = 16.sp, color = Color.White)
                        }

                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}

package com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMedt_e




import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.babillard.R



//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun TIPAMedt_e7Screen( /*navController: NavHostController*/ ){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        TIPAMedt_e7_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { TIPAMedt_e7_Headline() },
        drawerContent = {},
        content = { TIPAMedt_e7_Card() },
        bottomBar = { TIPAMedt_e7_Footer() }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun TIPAMedt_e7_Headline() {
    Column {
        Row(
            Modifier
                .clip(
                    RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )
                )
                .fillMaxWidth()
                .background(Color.Red)
                .padding(
                    horizontal = 8.dp,
                    vertical = 4.dp
                ),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { /*TODO*/}
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.KeyboardArrowLeft ,
                    contentDescription = null ,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }

            Row(
                modifier = Modifier
                    .height(45.dp)
                    .size(250.dp)
                    .padding(start = 40.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            ) {
                Text(
                    text = "EDT_E",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { /*TODO*/}
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.Add,
                    contentDescription = null ,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



////////////////////// Le pied de la page /////////////////
@Composable
fun TIPAMedt_e7_Footer () {
    Box(modifier = Modifier
        .height(20.dp)
        .fillMaxWidth()
        .background(color = Color.Red)
    ){
        Row(
            modifier = Modifier.padding(start = 170.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(100.dp)
        )
        {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { /*TODO*/ },
                /////////////////////////////////////////////// Click retour ///////////
                modifier = Modifier.size(32.dp, 32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iuc),
                    contentDescription = "My Image",
                    modifier = Modifier
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////////// Corps de la page /////////////////
@Composable
fun TIPAMedt_e7_Card() {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {

        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.iac),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(start = 1.dp).width(1.dp)
                )
            }
        }

        /////////////// Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<<     TI-PAM     >>",
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    fontSize = 22.sp,
                )
            }
        }

        /////////////// Détail 1 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.slundi03avril2023),
                                    contentDescription = null,
                                    modifier = Modifier.size(550.dp).padding(start = 1.dp).width(128.dp).height(100.dp)
                                )
                            }


                        }

                        Column {

                        }
                    }
                }
            }
        }

        /////////////// Détail 2 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("EDT_E")
                                }
                                Row{
                                    Text("Salle: ", fontWeight = FontWeight.Bold)
                                    Text("Ce234")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("03/04/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. BABAGNACK")
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/////////////////////////// Terminé ////////////////////////////////




//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Main prinicipal de la page ///////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@Composable
fun TIPAMedt_e7_Content(scaffoldState: LazyListState) {
    TIPAMedt_e7_Card()
}
////////////////////////////// Terminé ///////////////////////////////////


package lec57;

public class Notes {

}

// SSSP : Single Source Shortest Path

// Demerit of Dijksrea Algorithm: it does not always work correctly in negative weighted graph



// BALLAMNFORD : use for both directed and undirected graph
// sare egde pair ko list down kr lijiye
// sare vertex ko v-1 time relax krwate hai
// agar v times k baad bhi distance kam ho pa rha h to negative weight ki cycle h to vo baar baar distance kam kr degi i.e. cycle k sum negative h
// 
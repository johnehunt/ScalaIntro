package com.jjh.inner

class Graph(val label: String) {

  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node): Unit = {
      if (!connectedNodes.exists(node.equals)) {
        connectedNodes = node :: connectedNodes
      }
    }

    override def toString = s"Node() - part of $label"
  }

  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

object GraphApp extends App {
  println("Starting")
  val graph1: Graph = new Graph("graph1")
  val node1: graph1.Node = graph1.newNode
  val node2: graph1.Node = graph1.newNode
  node1.connectTo(node2)      // legal

  // Create a second graph object
  val graph2: Graph = new Graph("graph2")
  val node3: graph2.Node = graph2.newNode
  // node1.connectTo(node3)      // illegal! can't connect node1 to node3 as members of different graph objects
  println("Done")
}

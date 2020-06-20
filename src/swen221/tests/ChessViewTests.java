package swen221.tests;

import java.util.List;

import org.junit.jupiter.api.Test;
import swen221.chessview.Board;
import swen221.chessview.ChessGame;
import swen221.chessview.Position;
import swen221.chessview.Round;
import swen221.chessview.moves.*;
import swen221.chessview.pieces.*;

import static org.junit.jupiter.api.Assertions.*;

public class ChessViewTests {

	@Test
	public void test01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test02() {
		String input =
			"a2-a3 b7-b6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|p|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test03() {
		String input =
			"a2-a4 b7-b5\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|p|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test04() {
		String input =
			"d2-d4 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|P|p|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test05() {
		String input =
			"d2-d3 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"d3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test06() {
		String input =
			"Nb1-c3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|N|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test07() {
		String input =
			"Nb1-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|N|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test08() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"e2-e4 Nc6xd4\n" +
			"";
		String output =
			"8|r|_|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|n|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test09() {
		String input =
			"Nb1-c3 e7-e5\n" +
			"e2-e3 e5-e4\n" +
			"Nc3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|N|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test10() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test11() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-h4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|B|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test12() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5xe7\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|B|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test13() {
		String input =
			"e2-e4 e7-e5\n" +
			"Qd1-g4 Qd8-h4\n" +
			"Qg4-f4 Qh4-h6\n" +
			"Qf4-f6 Qh6xh2\n" +
			"";
		String output =
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|Q|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|q|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test14() {
		String input =
			"a2-a4 h7-h5\n" +
			"Ra1-a3 Rh8-h6\n" +
			"Ra3-d3 Rh6-g6\n" +
			"Rd3xd7\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|R|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|r|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|_|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		checkValid(input,output);
	}
	@Test public void test15() {
		String input =
						"e2-e3 e7-e6\n" +
						"Ke1-e2 Ke8-e7\n" +
						"";
		String output =
						"8|r|n|b|q|_|b|n|r|\n" +
						"7|p|p|p|p|k|p|p|p|\n" +
						"6|_|_|_|_|p|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|P|_|_|_|\n" +
						"2|P|P|P|P|K|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test16() {
		String input =
						"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4xQh4 Nb8-c6\n" +
						"Qh4xh7 Nc6-d4\n" +
						"Qh7xRh8 Nd4-b3\n" +
						"Qh8xNg8 Nb3-a5\n" +
						"Qg8xBf8+ Na5-c4";
		String output =
						"8|r|_|b|_|k|Q|_|_|\n" +
						"7|p|p|p|p|_|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|n|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test17() {
		String input =
				"h7-h6\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test18() {
		String input =
						"h2-h4 a7-a5\n" +
						"a2-a4 h7-h5\n" +
						"Rh1-h3 Ra8-a6\n" +
						"Ra1-a3 Rh8-h6\n" +
						"";
		String output =
						"8|_|n|b|q|k|b|n|_|\n" +
						"7|_|p|p|p|p|p|p|_|\n" +
						"6|r|_|_|_|_|_|_|r|\n" +
						"5|p|_|_|_|_|_|_|p|\n" +
						"4|P|_|_|_|_|_|_|P|\n" +
						"3|R|_|_|_|_|_|_|R|\n" +
						"2|_|P|P|P|P|P|P|_|\n" +
						"1|_|N|B|Q|K|B|N|_|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test19() {
		Piece[] p = {
				new Pawn(true),
				new Knight(true),
				new Bishop(true),
				new Rook(true),
				new Queen(true),
				new King(true)
		};

		String[] expectedChar = {
				"",
				"N",
				"B",
				"R",
				"Q",
				"K"
		};

		for(int i = 0; i < p.length; ++i) {
			Position oldPos = new Position(0, 0);
			Position newPos = new Position(1, 1);
			SinglePieceMove move = new SinglePieceMove(p[i], oldPos, newPos);
			assertEquals(p[i], move.piece());
			assertEquals(oldPos, move.oldPosition());
			assertEquals(newPos, move.newPosition());
			assertEquals(expectedChar[i] + oldPos + "-" + newPos, move.toString());
		}
	}

	@Test public void test20() {
			Position oldPos = new Position(0, 0);
			Position newPos = new Position(1, 1);
			SinglePieceTake move = new SinglePieceTake(new Queen(true), new Rook(false), oldPos, newPos);


			assertEquals("Q" + oldPos + "xR"+ newPos, move.toString());
	}

	@Test public void test21() {
		Position oldPos = new Position(0, 0);
		Position newPos = new Position(1, 1);
		SinglePieceTake move = new SinglePieceTake(new Queen(true), new Rook(false), oldPos, newPos);


		assertEquals("Q" + oldPos + "xR"+ newPos, move.toString());
	}

	@Test public void test22() {
		Pawn p = new Pawn(true);
		p.setDoubleStep(true);
		assertTrue(p.wasDoubleStep());
		p.setDoubleStep(false);
		assertFalse(p.wasDoubleStep());
	}

	@Test public void test23() {
		Pawn p = new Pawn(true);
		Pawn p2 = new Pawn(false);
		Pawn p3 = null;
		Rook p4 = new Rook(true);

		assertFalse(p.equals(p2));
		assertFalse(p.equals(p3));
		assertFalse(p.equals(p4));
	}

	@Test public void test24() {
		Board b = new Board();
		assertFalse(b.kingMoved(true));
		assertFalse(b.kingMoved(false));

		b.setKingMoved(true);
		assertTrue(b.kingMoved(true));
		assertFalse(b.kingMoved(false));

		b.setKingMoved(false);
		assertTrue(b.kingMoved(true));
		assertTrue(b.kingMoved(false));
	}

	@Test public void test25() {
		Board b = new Board();
		assertFalse(b.rookMoved(false, false));
		assertFalse(b.rookMoved(false, true));
		assertFalse(b.rookMoved(true, false));
		assertFalse(b.rookMoved(true, true));

		b.setRookMoved(false, false);
		assertTrue(b.rookMoved(false, false));
		assertFalse(b.rookMoved(false, true));
		assertFalse(b.rookMoved(true, false));
		assertFalse(b.rookMoved(true, true));

		b.setRookMoved(false, true);
		assertTrue(b.rookMoved(false, false));
		assertTrue(b.rookMoved(false, true));
		assertFalse(b.rookMoved(true, false));
		assertFalse(b.rookMoved(true, true));

		b.setRookMoved(true, false);
		assertTrue(b.rookMoved(false, false));
		assertTrue(b.rookMoved(false, true));
		assertTrue(b.rookMoved(true, false));
		assertFalse(b.rookMoved(true, true));

		b.setRookMoved(true, true);
		assertTrue(b.rookMoved(false, false));
		assertTrue(b.rookMoved(false, true));
		assertTrue(b.rookMoved(true, false));
		assertTrue(b.rookMoved(true, true));
	}

	@Test public void test26() {
		Board b = new Board();
		Piece p = new Pawn(true);
		Position pos = new Position(5, 5);

		assertNull(b.pieceAt(pos));
		b.setPieceAt(pos, p);
		assertEquals(p, b.pieceAt(pos));
	}

	@Test public void test27() {
		Board b = new Board();
		Piece p = new Pawn(true);
		Piece p2 = new Pawn(false);
		Position pos1 = new Position(5, 8);
		Position pos2 = new Position(5, 1);
		b.setPieceAt(pos1, p);
		b.setPieceAt(pos2, p2);
		assertTrue(b.clearRowExcept(new Position(5, 2), new Position(5, 7)));
		assertFalse(b.clearRowExcept(new Position(5, 1), new Position(5, 7)));
		assertFalse(b.clearRowExcept(new Position(5, 2), new Position(5, 8)));
		assertFalse(b.clearRowExcept(new Position(5, 1), new Position(5, 8), p));
		assertFalse(b.clearRowExcept(new Position(5, 1), new Position(5, 8), p2));
		assertTrue(b.clearRowExcept(new Position(5, 1), new Position(5, 8), p, p2));
	}

	@Test public void test28() {
		Board b = new Board();
		Piece p = new Pawn(true);
		Piece p2 = new Pawn(false);
		Position pos1 = new Position(8, 5);
		Position pos2 = new Position(1, 5);
		b.setPieceAt(pos1, p);
		b.setPieceAt(pos2, p2);
		b.setPieceAt(new Position(7, 5), null);
		b.setPieceAt(new Position(2, 5), null);

		assertTrue(b.clearColumnExcept(new Position(2, 5), new Position(7, 5)));
		assertFalse(b.clearColumnExcept(new Position(1, 5), new Position(7, 5)));
		assertFalse(b.clearColumnExcept(new Position(2, 5), new Position(8, 5)));
		assertFalse(b.clearColumnExcept(new Position(1, 5), new Position(8, 5), p));
		assertFalse(b.clearColumnExcept(new Position(1, 5), new Position(8, 5), p2));
		assertTrue(b.clearColumnExcept(new Position(1, 5), new Position(8, 5), p, p2));
	}

	@Test public void test29() {
		Position pos1 = new Position(8, 5);
		Position pos2 = new Position(1, 5);
		Position pos3 = new Position(8, 5);
		assertFalse(pos1.equals(pos2));
		assertNotEquals(pos1.hashCode(), pos2.hashCode());

		assertTrue(pos1.equals(pos3));
		assertEquals(pos1.hashCode(), pos3.hashCode());

		assertFalse(pos1.equals(null));
	}

	@Test public void test30() {
		String input =
						"d2-d4 e7-e6\n" +
						"h2-h3 Bf8-b4+\n" +
						"h3-h4"; // Should be invalid because white king is in check
		String output =
						"8|r|n|b|q|k|_|n|r|\n" +
						"7|p|p|p|p|_|p|p|p|\n" +
						"6|_|_|_|_|p|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|b|_|P|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|P|P|_|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test31() {
		String input =
						"d2-d4 e7-e6\n" +
						"h2-h3 Bf8-b4+\n" +
						"c2-c3"; // Should be valid to block check
		String output =
						"8|r|n|b|q|k|_|n|r|\n" +
						"7|p|p|p|p|_|p|p|p|\n" +
						"6|_|_|_|_|p|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|b|_|P|_|_|_|_|\n" +
						"3|_|_|P|_|_|_|_|P|\n" +
						"2|P|P|_|_|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test32() {
		String input =
						"d2-d4 e7-e6\n" +
						"h2-h3 Bf8-b5+\n" +
						"c2-c3";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|_|p|p|p|\n" +
						"6|_|_|_|_|p|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|P|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|P|P|_|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test33() {
		Position p1 = new Position(5, 3);
		Position p2 = new Position(2, 8);
		Piece p = new Queen(false);
		MultiPieceMove mm = new SinglePieceMove(p, p1, p2);
		Check m = new Check(mm);
		assertEquals(mm, m.move());
		assertEquals(mm.toString() + "+", m.toString());
	}

	@Test public void test34() {
		Position p1 = new Position(5, 3);
		Position p2 = new Position(2, 8);
		Piece p = new Queen(false);
		MultiPieceMove mm = new SinglePieceMove(p, p1, p2);
		NonCheck m = new NonCheck(mm);
		assertEquals(mm, m.move());
		assertEquals(mm.toString(), m.toString());
	}

	// Enpassant
	@Test public void test35() {
		String input =
						"e2-e4 h7-h6\n" +
						"e4-e5 f7-f5\n" +
						"e5xf6ep";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|p|_|\n" +
						"6|_|_|_|_|_|P|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test36() {
		String input =
						"e2-e4 h7-h6\n" +
						"e4-e5 f7-f5\n" +
						"e5xe6ep";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|P|p|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test37() {
		String input =
						"e2-e4 h7-h6\n" +
						"e4-e5 f7-f5\n" +
						"e5xe7ep";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|P|p|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test38() {
		String input =
						"e2-e4 h7-h6\n" +
						"a2-a3 f7-f5\n" +
						"e4xf6ep";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|p|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test39() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		b.setPieceAt(new Position(5, 6), null);
		b.setPieceAt(new Position(5, 5), p);
		EnPassant ep = new EnPassant(new SinglePieceMove(p, new Position(5, 5), new Position(6, 6)));
		assertFalse(ep.isValid(b));
	}

	@Test public void test40() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		b.setPieceAt(new Position(6, 6), new Pawn(false));
		b.setPieceAt(new Position(5, 5), p);
		EnPassant ep = new EnPassant(new SinglePieceMove(p, new Position(5, 5), new Position(6, 6)));
		assertFalse(ep.isValid(b));
	}

	@Test public void test41() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		Pawn p2 = new Pawn(false);
		p2.setDoubleStep(false);
		b.setPieceAt(new Position(5, 6), p2);
		b.setPieceAt(new Position(5, 5), p);
		EnPassant ep = new EnPassant(new SinglePieceMove(p, new Position(5, 5), new Position(6, 6)));
		assertFalse(ep.isValid(b));
	}

	@Test public void test42() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		b.setPieceAt(new Position(5, 6), new Queen(false));
		b.setPieceAt(new Position(5, 5), p);
		EnPassant ep = new EnPassant(new SinglePieceMove(p, new Position(5, 5), new Position(6, 6)));
		assertFalse(ep.isValid(b));
	}

	@Test public void test43() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		Pawn p2 = new Pawn(false);
		p2.setDoubleStep(false);
		b.setPieceAt(new Position(5, 6), p2);
		b.setPieceAt(new Position(5, 5), p);
		EnPassant ep = new EnPassant(new SinglePieceMove(p, new Position(5, 5), new Position(6, 6)));
		assertEquals(new Position(5, 5).toString() + "x" + new Position(6, 6).toString() + "ep", ep.toString());
	}

	@Test public void test44() {
		Move m1 = new SinglePieceMove(new Queen(false), new Position(1, 1), new Position(2, 2));
		Move m2 = new SinglePieceMove(new King(true), new Position(8, 8), new Position(7, 7));

		Round r = new Round(m1, m2);
		assertEquals("Qa1-b2 Kh8-g7", r.toString());

		Round r2 = new Round(m1, null);
		assertEquals("Qa1-b2", r2.toString());

		Exception ex = assertThrows(IllegalArgumentException.class, () -> { new Round(null, m2); });
		assertEquals("A round must always consist of a move by white", ex.getMessage());
	}

	@Test public void test45() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		//Pawn p2 = new Pawn(false);
		//p2.setDoubleStep(false);
		b.setPieceAt(new Position(8, 1), null);
		b.setPieceAt(new Position(7, 1), p);
		PawnPromotion pro = new PawnPromotion(new SinglePieceMove(p, new Position(7, 1), new Position(8, 1)), new Queen(true));
		assertTrue(pro.isValid(b));
		pro.apply(b);
		assertEquals(new Queen(true), b.pieceAt(new Position(8, 1)));
		assertEquals(new Position(7, 1).toString() + "-" + new Position(8, 1).toString() + "=Q", pro.toString());
	}

	@Test public void test46() {
		Board b = new Board();
		Pawn p = new Pawn(true);
		//Pawn p2 = new Pawn(false);
		//p2.setDoubleStep(false);
		b.setPieceAt(new Position(8, 1), null);
		b.setPieceAt(new Position(7, 1), p);
		PawnPromotion pro = new PawnPromotion(new SinglePieceMove(p, new Position(7, 1), new Position(8, 1)), new Queen(false));
		assertFalse(pro.isValid(b));
	}

	@Test public void test47() {
		String input =
						"e2-e4 e7-e5\n" +
						"Bf1-e2 Bf8-e7\n" +
						"Ng1-f3 Ng8-f6\n" +
						"O-O O-O";
		String output =
						"8|r|n|b|q|_|r|k|_|\n" +
						"7|p|p|p|p|b|p|p|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|N|_|_|\n" +
						"2|P|P|P|P|B|P|P|P|\n" +
						"1|R|N|B|Q|_|R|K|_|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test48() {
		String input =
						"e2-e4 e7-e5\n" +
						"Bf1-e2 Bf8-e7\n" +
						"Ng1-f3 Ng8-f6\n" +
						"O-O+ O-O+";
		String output =
						"8|r|n|b|q|k|_|_|r|\n" +
						"7|p|p|p|p|b|p|p|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|N|_|_|\n" +
						"2|P|P|P|P|B|P|P|P|\n" +
						"1|R|N|B|Q|K|_|_|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test49() {
		String input =
						"e2-e4 e7-e5\n" +
						"Qd1-e2 Qd8-e7\n" +
						"d2-d4 d7-d5\n" +
						"Bc1-d2 Bc8-d7\n" +
						"Nb1-a3 Nb8-a6\n" +
						"O-O-O O-O-O";
		String output =
						"8|_|_|k|r|_|b|n|r|\n" +
						"7|p|p|p|b|q|p|p|p|\n" +
						"6|n|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|p|p|_|_|_|\n" +
						"4|_|_|_|P|P|_|_|_|\n" +
						"3|N|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|B|Q|P|P|P|\n" +
						"1|_|_|K|R|_|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test50() {
		String input =
				"e2-e4 e7-e5\n" +
						"Qd1-e2 Qd8-e7\n" +
						"d2-d4 d7-d5\n" +
						"Bc1-d2 Bc8-d7\n" +
						"Nb1-a3 Nb8-a6\n" +
						"O-O-O+ O-O-O+";
		String output =
						"8|r|_|_|_|k|b|n|r|\n" +
						"7|p|p|p|b|q|p|p|p|\n" +
						"6|n|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|p|p|_|_|_|\n" +
						"4|_|_|_|P|P|_|_|_|\n" +
						"3|N|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|B|Q|P|P|P|\n" +
						"1|R|_|_|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test51() {
		String input =
				"e2-e4 e7-e5\n" +
						"Qd1-e2 Qd8-e7\n" +
						"d2-d4 d7-d5\n" +
						"Bc1-d2 Bc8-d7\n" +
						"Nb1-a3 Nb8-a6\n" +
						"O-A O-O";
		try {
			assertThrows(IllegalArgumentException.class, () -> { new ChessGame(input); });
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}

	@Test public void test52() {
		String input =
				"e2la5 e7-e5";
		try {
			assertThrows(IllegalArgumentException.class, () -> { new ChessGame(input); });
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}

	@Test public void test53() {
		String input =
				"ae2-a5 e7-e5";
		try {
			assertThrows(IllegalArgumentException.class, () -> { new ChessGame(input); });
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}

	@Test public void test54() {
		String input =
						"e2-e4 d7-d5\n" +
						"e4xd5 Qd8-d6\n" +
						"f2-f4 Qd6-h6\n" +
						"d5-d6 e7-e5\n" +
						"Bf1-e2 e5xf4\n" +
						"d6-d7 Ke8-e7\n" +
						"d7-d8=N\n" +
						"";
		String output =
						"8|r|n|b|N|_|b|n|r|\n" +
						"7|p|p|p|_|k|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|q|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|p|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|B|_|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test55() {
		String input =
				"e2-e4 d7-d5\n" +
						"e4xd5 Qd8-d6\n" +
						"f2-f4 Qd6-h6\n" +
						"d5-d6 e7-e5\n" +
						"Bf1-e2 e5xf4\n" +
						"d6-d7 Ke8-e7\n" +
						"d7-d8=B\n" +
						"";
		String output =
						"8|r|n|b|B|_|b|n|r|\n" +
						"7|p|p|p|_|k|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|q|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|p|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|B|_|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test56() {
		String input =
				"e2-e4 d7-d5\n" +
						"e4xd5 Qd8-d6\n" +
						"f2-f4 Qd6-h6\n" +
						"d5-d6 e7-e5\n" +
						"Bf1-e2 e5xf4\n" +
						"d6-d7 Ke8-e7\n" +
						"d7-d8=R\n" +
						"";
		String output =
						"8|r|n|b|R|_|b|n|r|\n" +
						"7|p|p|p|_|k|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|q|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|p|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|B|_|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test57() {
		String input =
				"e2-e4 d7-d5\n" +
						"e4xd5 Qd8-d6\n" +
						"f2-f4 Qd6-h6\n" +
						"d5-d6 e7-e5\n" +
						"Bf1-e2 e5xf4\n" +
						"d6-d7 Ke8-e7\n" +
						"d7-d8=K\n" +
						"";
		String output =
						"8|r|n|b|K|_|b|n|r|\n" +
						"7|p|p|p|_|k|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|q|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|p|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|B|_|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	@Test public void test58() {
		String input =
				"e2-e4 d7-d5\n" +
						"e4xd5 Qd8-d6\n" +
						"f2-f4 Qd6-h6\n" +
						"d5-d6 e7-e5\n" +
						"Bf1-e2 e5xf4\n" +
						"d6-d7 Ke8-e7\n" +
						"d7-d8=Q\n" +
						"";
		String output =
						"8|r|n|b|Q|_|b|n|r|\n" +
						"7|p|p|p|_|k|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|q|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|p|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|B|_|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		checkValid(input,output);
	}

	// The following provides a simple helper method for all tests.
	public static void checkValid(String input, String expectedOutput) {
		try {
			ChessGame game = new ChessGame(input);
			List<Board> boards = game.boards();
			if (boards.isEmpty()) {
				fail("test failed with insufficient boards on input: " + input);
			}
			String actualOutput = boards.get(boards.size() - 1).toString();
			assertEquals(expectedOutput, actualOutput);
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}
}

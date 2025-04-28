from flask import Flask, jsonify, request

app = Flask(__name__)


# Server Testing Route
@app.route("/")
def home():
    return jsonify({"status": True, "msg": "Success"})


# Route which takes two numbers as query_params and returns their sum
@app.route("/api/data", methods=["GET"])
def add_data():
    n1 = request.args.get("number1")
    n2 = request.args.get("number2")

    return jsonify({"result": int(n1) + int(n2), "status": True})


if __name__ == "__main__":
    app.run(debug=True, port=8000)
